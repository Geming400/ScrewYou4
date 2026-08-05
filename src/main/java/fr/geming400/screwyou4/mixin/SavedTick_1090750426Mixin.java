package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.ticks.SavedTick.class)
public class SavedTick_1090750426Mixin {
        @Inject(at = @At("HEAD"), method = "priority()Lnet/minecraft/world/ticks/TickPriority;", cancellable = true)
    private void priority__1519536224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1519536224L))
            info.setReturnValue(net.minecraft.world.ticks.TickPriority.LOW);
    }

    @Inject(at = @At("HEAD"), method = "type()Ljava/lang/Object;", cancellable = true)
    private void type__2023582418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2023582418L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_182124157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(182124157L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1861173950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1861173950L))
            info.setReturnValue("6\"ip= h\u9C0ACaA");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1648102516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1648102516L))
            info.setReturnValue(-127628110);
    }

    @Inject(at = @At("HEAD"), method = "delay()I", cancellable = true)
    private void delay__609149412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-609149412L))
            info.setReturnValue(-389565244);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos__1190025850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1190025850L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "probe(Ljava/lang/Object;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/ticks/SavedTick;", cancellable = true)
    private static void probe__293437277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-293437277L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_1442399238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1442399238L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(JJ)Lnet/minecraft/world/ticks/ScheduledTick;", cancellable = true)
    private void unpack_1408738219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1408738219L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "filterTickListForChunk(Ljava/util/List;Lnet/minecraft/world/level/ChunkPos;)Ljava/util/List;", cancellable = true)
    private static void filterTickListForChunk_1573112315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1573112315L))
            info.setReturnValue(null);
    }


}
