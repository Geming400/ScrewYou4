package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.PatchedDataComponentMap.class)
public class PatchedDataComponentMap_724082478Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void remove_560990072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(560990072L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_762344723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(762344723L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get_560990072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(560990072L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2109594240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2109594240L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__411377994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-411377994L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_762344723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(762344723L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/core/component/PatchedDataComponentMap;", cancellable = true)
    private void copy_1474433529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1474433529L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "iterator()Ljava/util/Iterator;", cancellable = true)
    private void iterator__1427533555(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1427533555L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/core/component/TypedDataComponent;)Ljava/lang/Object;", cancellable = true)
    private void set_1183900264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1183900264L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/core/component/DataComponentType;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void set__1603927716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1603927716L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "keySet()Ljava/util/Set;", cancellable = true)
    private void keySet__1104953009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1104953009L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setAll(Lnet/minecraft/core/component/DataComponentMap;)V", cancellable = true)
    private void setAll_1149854208(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1149854208L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasNonDefault(Lnet/minecraft/core/component/DataComponentType;)Z", cancellable = true)
    private void hasNonDefault_1365498932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1365498932L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toImmutableMap()Lnet/minecraft/core/component/DataComponentMap;", cancellable = true)
    private void toImmutableMap_1927887418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1927887418L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "restorePatch(Lnet/minecraft/core/component/DataComponentPatch;)V", cancellable = true)
    private void restorePatch__1742592940(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1742592940L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "asPatch()Lnet/minecraft/core/component/DataComponentPatch;", cancellable = true)
    private void asPatch__1001092146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1001092146L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clearPatch()V", cancellable = true)
    private void clearPatch_762357216(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(762357216L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "applyPatch(Lnet/minecraft/core/component/DataComponentPatch;)V", cancellable = true)
    private void applyPatch__1742592940(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1742592940L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fromPatch(Lnet/minecraft/core/component/DataComponentMap;Lnet/minecraft/core/component/DataComponentPatch;)Lnet/minecraft/core/component/PatchedDataComponentMap;", cancellable = true)
    private static void fromPatch_36854045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(36854045L))
            info.setReturnValue(null);
    }


}
