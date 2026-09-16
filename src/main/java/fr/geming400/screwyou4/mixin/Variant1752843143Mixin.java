package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.dispatch.Variant.class)
public class Variant1752843143Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_844216875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(844216875L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1771700628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1771700628L))
            info.setReturnValue("7:\uD315C2s{\u1CA1^]uIh\uBAD8IV*[E\uCC14z\uCC21Xz?QF]#eG#5\u1061F}}3M9f%\u3385\u5BBFwj\"wSQl'DKJ%}.E3MoXI}k_|\u380CAX7m\u78274#NRA\u60F0d\u6CE5L>\uC07B");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1984772062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1984772062L))
            info.setReturnValue(791125016);
    }

    @Inject(at = @At("HEAD"), method = "with(Lnet/minecraft/client/renderer/block/dispatch/VariantMutator;)Lnet/minecraft/client/renderer/block/dispatch/Variant;", cancellable = true)
    private void with__974275202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-974275202L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolveDependencies(Lnet/minecraft/client/resources/model/ResolvableModel$Resolver;)V", cancellable = true)
    private void resolveDependencies__1466433870(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1466433870L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "withUvLock(Z)Lnet/minecraft/client/renderer/block/dispatch/Variant;", cancellable = true)
    private void withUvLock__1936772181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1936772181L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "modelState()Lnet/minecraft/client/renderer/block/dispatch/Variant$SimpleModelState;", cancellable = true)
    private void modelState_1514895923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1514895923L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withZRot(Lcom/mojang/math/Quadrant;)Lnet/minecraft/client/renderer/block/dispatch/Variant;", cancellable = true)
    private void withZRot__223219729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-223219729L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withModel(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/block/dispatch/Variant;", cancellable = true)
    private void withModel_1440680898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1440680898L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withState(Lnet/minecraft/client/renderer/block/dispatch/Variant$SimpleModelState;)Lnet/minecraft/client/renderer/block/dispatch/Variant;", cancellable = true)
    private void withState__1876907531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1876907531L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withYRot(Lcom/mojang/math/Quadrant;)Lnet/minecraft/client/renderer/block/dispatch/Variant;", cancellable = true)
    private void withYRot__1873356528(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1873356528L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withXRot(Lcom/mojang/math/Quadrant;)Lnet/minecraft/client/renderer/block/dispatch/Variant;", cancellable = true)
    private void withXRot_771473969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(771473969L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/resources/model/ModelBaker;)Lnet/minecraft/client/renderer/block/dispatch/BlockStateModelPart;", cancellable = true)
    private void bake__1152870604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1152870604L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "modelLocation()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void modelLocation__955877684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-955877684L))
            info.setReturnValue(null);
    }


}
