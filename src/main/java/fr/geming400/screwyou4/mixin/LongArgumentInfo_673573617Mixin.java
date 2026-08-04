package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.synchronization.brigadier.LongArgumentInfo.class)
public class LongArgumentInfo_673573617Mixin {
        @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork__283796649(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-283796649L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/synchronization/brigadier/LongArgumentInfo$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_1363695147(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1363695147L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/LongArgumentType;)Lnet/minecraft/commands/synchronization/brigadier/LongArgumentInfo$Template;", cancellable = true)
    private void unpack_655875841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(655875841L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/ArgumentType;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void unpack_1587380217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1587380217L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson_226018407(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(226018407L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/synchronization/brigadier/LongArgumentInfo$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson_112717459(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(112717459L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void deserializeFromNetwork_214192187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(214192187L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/synchronization/brigadier/LongArgumentInfo$Template;", cancellable = true)
    private void deserializeFromNetwork_291451687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(291451687L))
            info.setReturnValue(null);
    }


}
