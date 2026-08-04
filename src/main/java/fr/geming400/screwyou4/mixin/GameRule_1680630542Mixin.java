package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.gamerules.GameRule.class)
public class GameRule_1680630542Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_545170070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(545170070L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/lang/String;", cancellable = true)
    private void id_545170070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(545170070L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultValue()Ljava/lang/Object;", cancellable = true)
    private void defaultValue__755144536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-755144536L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "argument()Lcom/mojang/brigadier/arguments/ArgumentType;", cancellable = true)
    private void argument__707517304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-707517304L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "category()Lnet/minecraft/world/level/gamerules/GameRuleCategory;", cancellable = true)
    private void category_198955273(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(198955273L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getIdentifier()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getIdentifier__762436012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-762436012L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueClass()Ljava/lang/Class;", cancellable = true)
    private void valueClass_679967021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(679967021L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserialize(Ljava/lang/String;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void deserialize_1619604998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1619604998L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serialize(Ljava/lang/Object;)Ljava/lang/String;", cancellable = true)
    private void serialize__1301944198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1301944198L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requiredFeatures()Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void requiredFeatures__1949516257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1949516257L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void valueCodec_1288664915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1288664915L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDescriptionId()Ljava/lang/String;", cancellable = true)
    private void getDescriptionId_545170070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(545170070L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gameRuleType()Lnet/minecraft/world/level/gamerules/GameRuleType;", cancellable = true)
    private void gameRuleType__1412756019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1412756019L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "callVisitor(Lnet/minecraft/world/level/gamerules/GameRuleTypeVisitor;)V", cancellable = true)
    private void callVisitor__624928233(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-624928233L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getIdentifierWithFallback()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getIdentifierWithFallback__762436012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-762436012L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCommandResult(Ljava/lang/Object;)I", cancellable = true)
    private void getCommandResult__1228841329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1228841329L))
            info.setReturnValue(null);
    }


}
