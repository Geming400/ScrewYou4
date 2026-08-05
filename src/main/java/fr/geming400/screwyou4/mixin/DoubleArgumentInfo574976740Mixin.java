package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.synchronization.brigadier.DoubleArgumentInfo.class)
public class DoubleArgumentInfo574976740Mixin {
        @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/ArgumentType;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void unpack_1488783341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1488783341L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/DoubleArgumentType;)Lnet/minecraft/commands/synchronization/brigadier/DoubleArgumentInfo$Template;", cancellable = true)
    private void unpack_1133657247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1133657247L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void deserializeFromNetwork_115595311(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(115595311L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/synchronization/brigadier/DoubleArgumentInfo$Template;", cancellable = true)
    private void deserializeFromNetwork__583323600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-583323600L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson_127421531(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(127421531L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/synchronization/brigadier/DoubleArgumentInfo$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson__534812644(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-534812644L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/synchronization/brigadier/DoubleArgumentInfo$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork__1596682902(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1596682902L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork__382393525(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-382393525L))
            info.cancel();
    }


}
