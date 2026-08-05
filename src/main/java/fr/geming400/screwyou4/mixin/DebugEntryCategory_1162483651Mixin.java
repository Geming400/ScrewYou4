package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.debug.DebugEntryCategory.class)
public class DebugEntryCategory_1162483651Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1746971387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1746971387L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_27023675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(27023675L))
            info.setReturnValue("It)9] \u4F696");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1200746392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1200746392L))
            info.setReturnValue(1644157891);
    }

    @Inject(at = @At("HEAD"), method = "label()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void label__1014425515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1014425515L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sortKey()F", cancellable = true)
    private void sortKey_1200743013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1200743013L))
            info.setReturnValue(9.399518E8F);
    }


}
