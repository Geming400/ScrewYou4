package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.synchronization.brigadier.FloatArgumentInfo.class)
public class FloatArgumentInfo2143195641Mixin {
        @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_1185825376(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1185825376L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/synchronization/brigadier/FloatArgumentInfo$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_493056484(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(493056484L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/FloatArgumentType;)Lnet/minecraft/commands/synchronization/brigadier/FloatArgumentInfo$Template;", cancellable = true)
    private void unpack__12966552(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-12966552L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/ArgumentType;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void unpack__1237965054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1237965054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson_1695640432(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1695640432L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/synchronization/brigadier/FloatArgumentInfo$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson__1664602388(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1664602388L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void deserializeFromNetwork_1683814212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1683814212L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/synchronization/brigadier/FloatArgumentInfo$Template;", cancellable = true)
    private void deserializeFromNetwork__1639219322(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1639219322L))
            info.setReturnValue(null);
    }


}
