package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.ticks.SavedTick.class)
public class SavedTick_1090750426Mixin {
        @Inject(at = @At("HEAD"), method = "priority()Lnet/minecraft/world/ticks/TickPriority;", cancellable = true)
    private void priority__1946541060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1946541060L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Ljava/lang/Object;", cancellable = true)
    private void type__1345024652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1345024652L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1818704612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1818704612L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__44709550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-44709550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1129013167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1129013167L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "delay()I", cancellable = true)
    private void delay_1129012671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1129012671L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos__802636454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-802636454L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "probe(Ljava/lang/Object;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/ticks/SavedTick;", cancellable = true)
    private static void probe__1918351117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1918351117L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_1574428400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1574428400L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(JJ)Lnet/minecraft/world/ticks/ScheduledTick;", cancellable = true)
    private void unpack__50003427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-50003427L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "filterTickListForChunk(Ljava/util/List;Lnet/minecraft/world/level/ChunkPos;)Ljava/util/List;", cancellable = true)
    private static void filterTickListForChunk__945056444(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-945056444L))
            info.setReturnValue(null);
    }


}
