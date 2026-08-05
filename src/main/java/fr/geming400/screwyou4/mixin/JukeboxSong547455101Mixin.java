package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.JukeboxSong.class)
public class JukeboxSong547455101Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1932967360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1932967360L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__588004874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-588004874L))
            info.setReturnValue("avZz2Nl6!狡_Y6*2){");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_585717843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(585717843L))
            info.setReturnValue(-1590238555);
    }

    @Inject(at = @At("HEAD"), method = "description()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void description__1629454064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1629454064L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromStack(Lnet/minecraft/world/item/ItemStack;)Ljava/util/Optional;", cancellable = true)
    private static void fromStack__1406739234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1406739234L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "soundEvent()Lnet/minecraft/core/Holder;", cancellable = true)
    private void soundEvent_2096330873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2096330873L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lengthInSeconds()F", cancellable = true)
    private void lengthInSeconds_585714464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(585714464L))
            info.setReturnValue(9.187016E8F);
    }

    @Inject(at = @At("HEAD"), method = "lengthInTicks()I", cancellable = true)
    private void lengthInTicks_585717347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(585717347L))
            info.setReturnValue(1307320736);
    }

    @Inject(at = @At("HEAD"), method = "hasFinished(J)Z", cancellable = true)
    private void hasFinished_1762299438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1762299438L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "comparatorOutput()I", cancellable = true)
    private void comparatorOutput_585717347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(585717347L))
            info.setReturnValue(1307320736);
    }


}
