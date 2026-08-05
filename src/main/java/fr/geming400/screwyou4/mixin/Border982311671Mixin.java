package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.metadata.gui.GuiSpriteScaling.NineSlice.Border.class)
public class Border982311671Mixin {
        @Inject(at = @At("HEAD"), method = "bottom()I", cancellable = true)
    private void bottom_1020573917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1020573917L))
            info.setReturnValue(-1187657450);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1927143366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1927143366L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__153148304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-153148304L))
            info.setReturnValue("Al7w.nU%㟀_梃=Oej]1rKh.2蟛, :@.M$GZ`ए*");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1020574413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1020574413L))
            info.setReturnValue(-1389804969);
    }

    @Inject(at = @At("HEAD"), method = "top()I", cancellable = true)
    private void top_1020573917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1020573917L))
            info.setReturnValue(-1186657550);
    }

    @Inject(at = @At("HEAD"), method = "left()I", cancellable = true)
    private void left_1020573917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1020573917L))
            info.setReturnValue(-1186657550);
    }

    @Inject(at = @At("HEAD"), method = "right()I", cancellable = true)
    private void right_1020573917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1020573917L))
            info.setReturnValue(-1186657550);
    }


}
