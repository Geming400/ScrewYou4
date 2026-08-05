package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.dispatch.Variant.class)
public class Variant1752843143Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1156611894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1156611894L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_617383168(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(617383168L))
            info.setReturnValue("囸Y(O,WZ}2");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1791105885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1791105885L))
            info.setReturnValue(441889098);
    }

    @Inject(at = @At("HEAD"), method = "with(Lnet/minecraft/client/renderer/block/dispatch/VariantMutator;)Lnet/minecraft/client/renderer/block/dispatch/Variant;", cancellable = true)
    private void with_151528708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(151528708L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolveDependencies(Lnet/minecraft/client/resources/model/ResolvableModel$Resolver;)V", cancellable = true)
    private void resolveDependencies_1703049213(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1703049213L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "withUvLock(Z)Lnet/minecraft/client/renderer/block/dispatch/Variant;", cancellable = true)
    private void withUvLock_964837053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(964837053L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withState(Lnet/minecraft/client/renderer/block/dispatch/Variant$SimpleModelState;)Lnet/minecraft/client/renderer/block/dispatch/Variant;", cancellable = true)
    private void withState_423410688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(423410688L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withXRot(Lcom/mojang/math/Quadrant;)Lnet/minecraft/client/renderer/block/dispatch/Variant;", cancellable = true)
    private void withXRot__2001678708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2001678708L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withYRot(Lcom/mojang/math/Quadrant;)Lnet/minecraft/client/renderer/block/dispatch/Variant;", cancellable = true)
    private void withYRot__2001678708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2001678708L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withZRot(Lcom/mojang/math/Quadrant;)Lnet/minecraft/client/renderer/block/dispatch/Variant;", cancellable = true)
    private void withZRot__2001678708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2001678708L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "modelState()Lnet/minecraft/client/renderer/block/dispatch/Variant$SimpleModelState;", cancellable = true)
    private void modelState_682624539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(682624539L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withModel(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/block/dispatch/Variant;", cancellable = true)
    private void withModel__1335106305(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1335106305L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "modelLocation()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void modelLocation__690223410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-690223410L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/resources/model/ModelBaker;)Lnet/minecraft/client/renderer/block/dispatch/BlockStateModelPart;", cancellable = true)
    private void bake_1377809709(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1377809709L))
            info.setReturnValue(null);
    }


}
