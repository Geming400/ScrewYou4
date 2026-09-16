package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.providers.UnihexProvider.Dimensions.class)
public class Dimensions_1855686433Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_947060164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(947060164L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1668857339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1668857339L))
            info.setReturnValue("\uA997(8bH");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1881928773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1881928773L))
            info.setReturnValue(-322803465);
    }

    @Inject(at = @At("HEAD"), method = "left(I)I", cancellable = true)
    private static void left__1594065602(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1594065602L))
            info.setReturnValue(-673801242);
    }

    @Inject(at = @At("HEAD"), method = "left()I", cancellable = true)
    private void left__750343841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-750343841L))
            info.setReturnValue(-1582101626);
    }

    @Inject(at = @At("HEAD"), method = "right()I", cancellable = true)
    private void right_415009898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(415009898L))
            info.setReturnValue(-115058505);
    }

    @Inject(at = @At("HEAD"), method = "right(I)I", cancellable = true)
    private static void right_172161939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(172161939L))
            info.setReturnValue(173522944);
    }

    @Inject(at = @At("HEAD"), method = "pack()I", cancellable = true)
    private void pack__691707251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-691707251L))
            info.setReturnValue(-419996078);
    }

    @Inject(at = @At("HEAD"), method = "pack(II)I", cancellable = true)
    private static void pack__1464455963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1464455963L))
            info.setReturnValue(-163416894);
    }


}
