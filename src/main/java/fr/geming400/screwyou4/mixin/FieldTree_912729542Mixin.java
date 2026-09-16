package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.visitors.FieldTree.class)
public class FieldTree_912729542Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_4103273(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(4103273L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1683153066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1683153066L))
            info.setReturnValue("UXY\u63DD.]VP\u94EB");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1470081632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1470081632L))
            info.setReturnValue(1345092063);
    }

    @Inject(at = @At("HEAD"), method = "depth()I", cancellable = true)
    private void depth_1085108936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1085108936L))
            info.setReturnValue(-553818356);
    }

    @Inject(at = @At("HEAD"), method = "addEntry(Lnet/minecraft/nbt/visitors/FieldSelector;)V", cancellable = true)
    private void addEntry_1842415268(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1842415268L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSelected(Lnet/minecraft/nbt/TagType;Ljava/lang/String;)Z", cancellable = true)
    private void isSelected__310068143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-310068143L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "selectedFields()Ljava/util/Map;", cancellable = true)
    private void selectedFields_133608185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(133608185L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fieldsToRecurse()Ljava/util/Map;", cancellable = true)
    private void fieldsToRecurse_74290754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(74290754L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRoot()Lnet/minecraft/nbt/visitors/FieldTree;", cancellable = true)
    private static void createRoot__205175304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-205175304L))
            info.setReturnValue(null);
    }


}
