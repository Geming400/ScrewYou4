package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.TooltipFlag.Default.class)
public class Default_125359146Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1510871404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1510871404L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1010100830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1010100830L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_163621887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(163621887L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asCreative()Lnet/minecraft/world/item/TooltipFlag$Default;", cancellable = true)
    private void asCreative__337666154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-337666154L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isCreative()Z", cancellable = true)
    private void isCreative_163637728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(163637728L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "creative()Z", cancellable = true)
    private void creative_163637728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(163637728L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAdvanced()Z", cancellable = true)
    private void isAdvanced_163637728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(163637728L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "advanced()Z", cancellable = true)
    private void advanced_163637728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(163637728L))
            info.setReturnValue(null);
    }


}
