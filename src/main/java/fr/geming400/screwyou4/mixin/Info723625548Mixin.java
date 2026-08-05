package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.EntityArgument.Info.class)
public class Info723625548Mixin {
        @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/ArgumentType;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void unpack_1637432149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1637432149L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lnet/minecraft/commands/arguments/EntityArgument;)Lnet/minecraft/commands/arguments/EntityArgument$Info$Template;", cancellable = true)
    private void unpack_73248643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(73248643L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void deserializeFromNetwork_264244119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(264244119L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/arguments/EntityArgument$Info$Template;", cancellable = true)
    private void deserializeFromNetwork__351927964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-351927964L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork__233744717(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-233744717L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/arguments/EntityArgument$Info$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_47990348(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(47990348L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/arguments/EntityArgument$Info$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson__1500725686(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1500725686L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson_276070339(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(276070339L))
            info.cancel();
    }


}
