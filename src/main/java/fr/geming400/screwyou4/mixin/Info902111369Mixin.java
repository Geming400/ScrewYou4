package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ScoreHolderArgument.Info.class)
public class Info902111369Mixin {
        @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/ArgumentType;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void unpack_1815917970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1815917970L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lnet/minecraft/commands/arguments/ScoreHolderArgument;)Lnet/minecraft/commands/arguments/ScoreHolderArgument$Info$Template;", cancellable = true)
    private void unpack__982114052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-982114052L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void deserializeFromNetwork_442729940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(442729940L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/arguments/ScoreHolderArgument$Info$Template;", cancellable = true)
    private void deserializeFromNetwork__490464496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-490464496L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson_454556160(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(454556160L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/arguments/ScoreHolderArgument$Info$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson__479425156(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-479425156L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/arguments/ScoreHolderArgument$Info$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_84553844(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(84553844L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork__55258896(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-55258896L))
            info.cancel();
    }


}
