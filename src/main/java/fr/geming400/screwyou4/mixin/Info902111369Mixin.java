package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ScoreHolderArgument.Info.class)
public class Info902111369Mixin {
        @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_866680803(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(866680803L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/arguments/ScoreHolderArgument$Info$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_1305341607(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1305341607L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void deserializeFromNetwork__379738161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-379738161L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/arguments/ScoreHolderArgument$Info$Template;", cancellable = true)
    private void deserializeFromNetwork__608327093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-608327093L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson__645089763(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-645089763L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/arguments/ScoreHolderArgument$Info$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson__677202343(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-677202343L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lnet/minecraft/commands/arguments/ScoreHolderArgument;)Lnet/minecraft/commands/arguments/ScoreHolderArgument$Info$Template;", cancellable = true)
    private void unpack_743956910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(743956910L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/ArgumentType;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void unpack__1867747296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1867747296L))
            info.setReturnValue(null);
    }


}
