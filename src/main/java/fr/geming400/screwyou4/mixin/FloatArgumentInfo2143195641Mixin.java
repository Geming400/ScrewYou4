package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.synchronization.brigadier.FloatArgumentInfo.class)
public class FloatArgumentInfo2143195641Mixin {
        @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_2107765075(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2107765075L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/synchronization/brigadier/FloatArgumentInfo$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_748092689(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(748092689L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void deserializeFromNetwork_861346111(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(861346111L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/synchronization/brigadier/FloatArgumentInfo$Template;", cancellable = true)
    private void deserializeFromNetwork_9429675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(9429675L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson_595994509(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(595994509L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/synchronization/brigadier/FloatArgumentInfo$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson_1650831023(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1650831023L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/FloatArgumentType;)Lnet/minecraft/commands/synchronization/brigadier/FloatArgumentInfo$Template;", cancellable = true)
    private void unpack__1892744202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1892744202L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/ArgumentType;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void unpack__626663024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-626663024L))
            info.setReturnValue(null);
    }


}
