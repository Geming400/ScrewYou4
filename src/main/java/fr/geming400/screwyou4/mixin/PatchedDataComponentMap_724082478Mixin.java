package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.PatchedDataComponentMap.class)
public class PatchedDataComponentMap_724082478Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void remove_845769980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(845769980L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_1167814066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1167814066L))
            info.setReturnValue(-711555092);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get__1904177586(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1904177586L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__184544287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-184544287L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1494505506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1494505506L))
            info.setReturnValue("#z4@7N@ZE#sj<?s,\uBED1xgP\u5BA2C\u9E63\u674D`.e'");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1281434072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1281434072L))
            info.setReturnValue(153187182);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/core/component/PatchedDataComponentMap;", cancellable = true)
    private void copy_211719470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(211719470L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "iterator()Ljava/util/Iterator;", cancellable = true)
    private void iterator__1936806021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1936806021L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/core/component/TypedDataComponent;)Ljava/lang/Object;", cancellable = true)
    private void set__1193483322(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1193483322L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/core/component/DataComponentType;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void set_1326262206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1326262206L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "keySet()Ljava/util/Set;", cancellable = true)
    private void keySet_124534508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(124534508L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setAll(Lnet/minecraft/core/component/DataComponentMap;)V", cancellable = true)
    private void setAll_165007967(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(165007967L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "toImmutableMap()Lnet/minecraft/core/component/DataComponentMap;", cancellable = true)
    private void toImmutableMap__932690555(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-932690555L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asPatch()Lnet/minecraft/core/component/DataComponentPatch;", cancellable = true)
    private void asPatch__133943720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-133943720L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyPatch(Lnet/minecraft/core/component/DataComponentPatch;)V", cancellable = true)
    private void applyPatch_1315481166(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1315481166L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clearPatch()V", cancellable = true)
    private void clearPatch_1176455365(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1176455365L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasNonDefault(Lnet/minecraft/core/component/DataComponentType;)Z", cancellable = true)
    private void hasNonDefault__1319916538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1319916538L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "restorePatch(Lnet/minecraft/core/component/DataComponentPatch;)V", cancellable = true)
    private void restorePatch_1197826862(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1197826862L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fromPatch(Lnet/minecraft/core/component/DataComponentMap;Lnet/minecraft/core/component/DataComponentPatch;)Lnet/minecraft/core/component/PatchedDataComponentMap;", cancellable = true)
    private static void fromPatch__1592018341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1592018341L))
            info.setReturnValue(null);
    }


}
