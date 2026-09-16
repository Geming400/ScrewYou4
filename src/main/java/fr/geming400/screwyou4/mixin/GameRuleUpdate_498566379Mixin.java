package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.methods.GameRulesService.GameRuleUpdate.class)
public class GameRuleUpdate_498566379Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/lang/Object;", cancellable = true)
    private void value__504954570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-504954570L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__410059890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-410059890L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1268989903(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1268989903L))
            info.setReturnValue("\uAFD67\u4601OPS3\uD389hQ]V-p7kpfT0FEvxB7`[\uD12BaJIn.-8FBIQy=\u6D5Ci\uD1D6CT3fHlEw\u016Ec3\u54A0sd?LYU2b%$mq^6$!$W6");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1055918469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1055918469L))
            info.setReturnValue(-443317288);
    }

    @Inject(at = @At("HEAD"), method = "gameRule()Lnet/minecraft/world/level/gamerules/GameRule;", cancellable = true)
    private void gameRule_1044557906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1044557906L))
            info.setReturnValue(null);
    }


}
