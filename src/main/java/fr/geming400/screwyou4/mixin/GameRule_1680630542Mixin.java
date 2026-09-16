package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.gamerules.GameRule.class)
public class GameRule_1680630542Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1843913726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1843913726L))
            info.setReturnValue("}OxJM28tp\uAD57,\u7AA1l\"^TD>\u5635r}3/v}zT\"x('\u4210kt{%KQs]o&d\u40D0Feb]c8\uC80D\uA308_Hs%Gd,VcK6");
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/lang/String;", cancellable = true)
    private void id_2021792113(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2021792113L))
            info.setReturnValue("ERYdi+uRDiB&7g\uAB0B,;0dy\u9105h\uC437rI");
    }

    @Inject(at = @At("HEAD"), method = "defaultValue()Ljava/lang/Object;", cancellable = true)
    private void defaultValue__1887236008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1887236008L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "argument()Lcom/mojang/brigadier/arguments/ArgumentType;", cancellable = true)
    private void argument__340513941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-340513941L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "category()Lnet/minecraft/world/level/gamerules/GameRuleCategory;", cancellable = true)
    private void category__14895993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-14895993L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getIdentifier()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getIdentifier_194920435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(194920435L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueClass()Ljava/lang/Class;", cancellable = true)
    private void valueClass__1498661626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1498661626L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserialize(Ljava/lang/String;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void deserialize__1622843609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1622843609L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serialize(Ljava/lang/Object;)Ljava/lang/String;", cancellable = true)
    private void serialize__2004947110(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2004947110L))
            info.setReturnValue("{z-\u6E29CTy:zV>l4\u2026\u7F58;?'rS2Bjc\uAA29z}\u0535fg@vyh\"DR^*1<\u4F43S\u5694\uCB4Bu9");
    }

    @Inject(at = @At("HEAD"), method = "valueCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void valueCodec_1714181624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1714181624L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requiredFeatures()Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void requiredFeatures_777011875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(777011875L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDescriptionId()Ljava/lang/String;", cancellable = true)
    private void getDescriptionId_343512663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(343512663L))
            info.setReturnValue("S\u8419O=Rf_l;\"=zgw.b\uF91AsRz\uB440n");
    }

    @Inject(at = @At("HEAD"), method = "getIdentifierWithFallback()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getIdentifierWithFallback_1718004571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1718004571L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "callVisitor(Lnet/minecraft/world/level/gamerules/GameRuleTypeVisitor;)V", cancellable = true)
    private void callVisitor_74035783(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(74035783L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCommandResult(Ljava/lang/Object;)I", cancellable = true)
    private void getCommandResult_676597437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(676597437L))
            info.setReturnValue(-1179465774);
    }

    @Inject(at = @At("HEAD"), method = "gameRuleType()Lnet/minecraft/world/level/gamerules/GameRuleType;", cancellable = true)
    private void gameRuleType_1833470517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1833470517L))
            info.setReturnValue(net.minecraft.world.level.gamerules.GameRuleType.INT);
    }


}
