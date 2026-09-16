package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ResourceArgument.Info.class)
public class Info_1460757055Mixin {
        @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/ArgumentType;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void unpack__1309101611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1309101611L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lnet/minecraft/commands/arguments/ResourceArgument;)Lnet/minecraft/commands/arguments/ResourceArgument$Info$Template;", cancellable = true)
    private void unpack_1343378705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1343378705L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void deserializeFromNetwork_178907524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(178907524L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/arguments/ResourceArgument$Info$Template;", cancellable = true)
    private void deserializeFromNetwork__281471120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-281471120L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_1425326488(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1425326488L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/arguments/ResourceArgument$Info$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_370657366(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(370657366L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/arguments/ResourceArgument$Info$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson_311434228(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(311434228L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson__86444078(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-86444078L))
            info.cancel();
    }


}
