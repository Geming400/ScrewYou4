package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ResourceArgument.Info.class)
public class Info_1460757055Mixin {
        @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/ArgumentType;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void unpack__1920403641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1920403641L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lnet/minecraft/commands/arguments/ResourceArgument;)Lnet/minecraft/commands/arguments/ResourceArgument$Info$Template;", cancellable = true)
    private void unpack__1351768353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1351768353L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/arguments/ResourceArgument$Info$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_1726390697(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1726390697L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_503386789(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(503386789L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void deserializeFromNetwork_1001375625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1001375625L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/arguments/ResourceArgument$Info$Template;", cancellable = true)
    private void deserializeFromNetwork_1823270091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1823270091L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/arguments/ResourceArgument$Info$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson_208359345(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(208359345L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson_1013201845(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1013201845L))
            info.cancel();
    }


}
