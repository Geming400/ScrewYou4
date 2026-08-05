package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.UniformValue.IntUniform.class)
public class IntUniform1576652854Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/renderer/UniformValue$Type;", cancellable = true)
    private void type__1070853579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1070853579L))
            info.setReturnValue(net.minecraft.client.renderer.UniformValue.Type.FLOAT);
    }

    @Inject(at = @At("HEAD"), method = "value()I", cancellable = true)
    private void value_1614915100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1614915100L))
            info.setReturnValue(-1375507443);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1332802183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1332802183L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_441192879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(441192879L))
            info.setReturnValue("s=ぅ0R@mb벣jYl:4l턋)0TWfT.+J9");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1614915596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1614915596L))
            info.setReturnValue(-2723367);
    }

    @Inject(at = @At("HEAD"), method = "writeTo(Lcom/mojang/blaze3d/buffers/Std140Builder;)V", cancellable = true)
    private void writeTo__650963154(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-650963154L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSize(Lcom/mojang/blaze3d/buffers/Std140SizeCalculator;)V", cancellable = true)
    private void addSize__714103700(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-714103700L))
            info.cancel();
    }


}
