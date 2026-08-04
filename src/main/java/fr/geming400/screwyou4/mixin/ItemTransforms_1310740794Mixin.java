package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.cuboid.ItemTransforms.class)
public class ItemTransforms_1310740794Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1598714244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1598714244L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_175280818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(175280818L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1349003535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1349003535L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fixed()Lnet/minecraft/client/resources/model/cuboid/ItemTransform;", cancellable = true)
    private void fixed_496663321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(496663321L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "head()Lnet/minecraft/client/resources/model/cuboid/ItemTransform;", cancellable = true)
    private void head_496663321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(496663321L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTransform(Lnet/minecraft/world/item/ItemDisplayContext;)Lnet/minecraft/client/resources/model/cuboid/ItemTransform;", cancellable = true)
    private void getTransform__39290779(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-39290779L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ground()Lnet/minecraft/client/resources/model/cuboid/ItemTransform;", cancellable = true)
    private void ground_496663321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(496663321L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gui()Lnet/minecraft/client/resources/model/cuboid/ItemTransform;", cancellable = true)
    private void gui_496663321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(496663321L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "firstPersonRightHand()Lnet/minecraft/client/resources/model/cuboid/ItemTransform;", cancellable = true)
    private void firstPersonRightHand_496663321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(496663321L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fixedFromBottom()Lnet/minecraft/client/resources/model/cuboid/ItemTransform;", cancellable = true)
    private void fixedFromBottom_496663321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(496663321L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "firstPersonLeftHand()Lnet/minecraft/client/resources/model/cuboid/ItemTransform;", cancellable = true)
    private void firstPersonLeftHand_496663321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(496663321L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "thirdPersonLeftHand()Lnet/minecraft/client/resources/model/cuboid/ItemTransform;", cancellable = true)
    private void thirdPersonLeftHand_496663321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(496663321L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "thirdPersonRightHand()Lnet/minecraft/client/resources/model/cuboid/ItemTransform;", cancellable = true)
    private void thirdPersonRightHand_496663321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(496663321L))
            info.setReturnValue(null);
    }


}
