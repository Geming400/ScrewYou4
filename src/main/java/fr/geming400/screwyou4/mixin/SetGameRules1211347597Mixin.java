package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.TestEnvironmentDefinition.SetGameRules.class)
public class SetGameRules1211347597Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_302721329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(302721329L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1981771122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1981771122L))
            info.setReturnValue("\u6BEFWEjXE/7(\uCFFAQ59n%+t>&_cRjC>v-EQ.e4_Iwf.u-^ XH[:)y6s-cTI<7(+bJ\"q$oh&H^|<K;[jQX}`8");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1768699688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1768699688L))
            info.setReturnValue(619360021);
    }

    @Inject(at = @At("HEAD"), method = "setup(Lnet/minecraft/server/level/ServerLevel;)Lnet/minecraft/world/level/gamerules/GameRuleMap;", cancellable = true)
    private void setup__1601244739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1601244739L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setup(Lnet/minecraft/server/level/ServerLevel;)Ljava/lang/Object;", cancellable = true)
    private void setup__818014220(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-818014220L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "teardown(Lnet/minecraft/server/level/ServerLevel;Ljava/lang/Object;)V", cancellable = true)
    private void teardown_1834676137(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1834676137L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "teardown(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/level/gamerules/GameRuleMap;)V", cancellable = true)
    private void teardown_304045666(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(304045666L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2017174445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2017174445L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gameRulesMap()Lnet/minecraft/world/level/gamerules/GameRuleMap;", cancellable = true)
    private void gameRulesMap__764281678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-764281678L))
            info.setReturnValue(null);
    }


}
