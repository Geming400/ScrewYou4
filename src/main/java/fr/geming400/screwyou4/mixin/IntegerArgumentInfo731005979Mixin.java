package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.synchronization.brigadier.IntegerArgumentInfo.class)
public class IntegerArgumentInfo731005979Mixin {
        @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/ArgumentType;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void unpack__2038852686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2038852686L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/IntegerArgumentType;)Lnet/minecraft/commands/synchronization/brigadier/IntegerArgumentInfo$Template;", cancellable = true)
    private void unpack__1618367976(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1618367976L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void deserializeFromNetwork__550843551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-550843551L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/synchronization/brigadier/IntegerArgumentInfo$Template;", cancellable = true)
    private void deserializeFromNetwork_416244143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(416244143L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_695575413(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(695575413L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/synchronization/brigadier/IntegerArgumentInfo$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_1174983505(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1174983505L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/synchronization/brigadier/IntegerArgumentInfo$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson_957853555(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(957853555L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson__816195153(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-816195153L))
            info.cancel();
    }


}
