package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.methods.GameRulesService.GameRuleUpdate.class)
public class GameRuleUpdate_498566379Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/lang/Object;", cancellable = true)
    private void value__1937208699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1937208699L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1884078637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1884078637L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__636893597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-636893597L))
            info.setReturnValue("\u5F66+mpLF!g}X2`\u443Dn=!:nrk\uCE42Jfsy\u4BDBg\uC609yZQ5biZ^\u322CX{H9\u2071\uAD4Cy#7W+=(\uF93BJS)VT%Cu8T\uC36AoJ(C[|()#w0q6");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_536829120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(536829120L))
            info.setReturnValue(379537805);
    }

    @Inject(at = @At("HEAD"), method = "gameRule()Lnet/minecraft/world/level/gamerules/GameRule;", cancellable = true)
    private void gameRule__1787133500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1787133500L))
            info.setReturnValue(null);
    }


}
