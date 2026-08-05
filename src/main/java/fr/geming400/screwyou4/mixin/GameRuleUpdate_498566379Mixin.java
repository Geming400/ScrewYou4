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
            info.setReturnValue("彦+mpLF!g}X2`䐽n=!:nrk칂Jfsy䯛g옉yZQ5biZ^㈬X{H9ⁱ굌y#7W+=(碌JS)VT%Cu8T썪oJ(C[|()#w0q6");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_536829120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(536829120L))
            info.setReturnValue(101262705);
    }

    @Inject(at = @At("HEAD"), method = "gameRule()Lnet/minecraft/world/level/gamerules/GameRule;", cancellable = true)
    private void gameRule__1787133500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1787133500L))
            info.setReturnValue(null);
    }


}
