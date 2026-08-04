package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.visitors.FieldTree.class)
public class FieldTree_912729542Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1996725496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1996725496L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__222730434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-222730434L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_950992283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(950992283L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "depth()I", cancellable = true)
    private void depth_950991787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(950991787L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addEntry(Lnet/minecraft/nbt/visitors/FieldSelector;)V", cancellable = true)
    private void addEntry_1763519253(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1763519253L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSelected(Lnet/minecraft/nbt/TagType;Ljava/lang/String;)Z", cancellable = true)
    private void isSelected_248366508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(248366508L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selectedFields()Ljava/util/Map;", cancellable = true)
    private void selectedFields__1091894099(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1091894099L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fieldsToRecurse()Ljava/util/Map;", cancellable = true)
    private void fieldsToRecurse__1091894099(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1091894099L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRoot()Lnet/minecraft/nbt/visitors/FieldTree;", cancellable = true)
    private static void createRoot__1764594822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1764594822L))
            info.setReturnValue(null);
    }


}
