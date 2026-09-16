package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.ItemCombinerMenuSlotDefinition.SlotDefinition.class)
public class SlotDefinition_889992759Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__18633510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-18633510L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1660416283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1660416283L))
            info.setReturnValue("\u69E1EkFa_g@)+h&Qdt6\u3008\uD0CF#N<\uC12C>\u9909duWfa)X;a\uC258e5?4f\uA3A5V:s[#,bwm\uFACE");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1447344849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1447344849L))
            info.setReturnValue(33397700);
    }

    @Inject(at = @At("HEAD"), method = "x()I", cancellable = true)
    private void x_68785828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(68785828L))
            info.setReturnValue(1724164245);
    }

    @Inject(at = @At("HEAD"), method = "y()I", cancellable = true)
    private void y_97414979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(97414979L))
            info.setReturnValue(631263951);
    }

    @Inject(at = @At("HEAD"), method = "slotIndex()I", cancellable = true)
    private void slotIndex__1194494168(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1194494168L))
            info.setReturnValue(1244858846);
    }

    @Inject(at = @At("HEAD"), method = "mayPlace()Ljava/util/function/Predicate;", cancellable = true)
    private void mayPlace__2081197274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2081197274L))
            info.setReturnValue(null);
    }


}
