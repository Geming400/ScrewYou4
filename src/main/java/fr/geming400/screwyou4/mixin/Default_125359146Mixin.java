package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.TooltipFlag.Default.class)
public class Default_125359146Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__783267123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-783267123L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_895782670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(895782670L))
            info.setReturnValue("\u39D3-H&U\uC6C7N\u9FEBKw[hO[\u22DF5:8i8K\uAC5B%gV0 T()4T\u2B68\uAE27a)EyE,?Jc6");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_682711236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(682711236L))
            info.setReturnValue(-1740886442);
    }

    @Inject(at = @At("HEAD"), method = "isAdvanced()Z", cancellable = true)
    private void isAdvanced__2009162252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2009162252L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isCreative()Z", cancellable = true)
    private void isCreative_1538016903(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1538016903L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "asCreative()Lnet/minecraft/world/item/TooltipFlag$Default;", cancellable = true)
    private void asCreative__6763689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-6763689L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "advanced()Z", cancellable = true)
    private void advanced_117393150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(117393150L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "creative()Z", cancellable = true)
    private void creative__630394991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-630394991L))
            info.setReturnValue(true);
    }


}
