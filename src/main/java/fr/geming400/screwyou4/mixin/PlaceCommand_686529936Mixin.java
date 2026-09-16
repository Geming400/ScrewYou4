package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.commands.PlaceCommand.class)
public class PlaceCommand_686529936Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lcom/mojang/brigadier/CommandDispatcher;)V", cancellable = true)
    private static void register_568575405(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(568575405L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "placeStructure(Lnet/minecraft/commands/CommandSourceStack;Lnet/minecraft/core/Holder$Reference;Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private static void placeStructure_296422023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(296422023L))
            info.setReturnValue(2018628510);
    }

    @Inject(at = @At("HEAD"), method = "placeJigsaw(Lnet/minecraft/commands/CommandSourceStack;Lnet/minecraft/core/Holder;Lnet/minecraft/resources/Identifier;ILnet/minecraft/core/BlockPos;)I", cancellable = true)
    private static void placeJigsaw_1083407157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1083407157L))
            info.setReturnValue(283451455);
    }

    @Inject(at = @At("HEAD"), method = "placeTemplate(Lnet/minecraft/commands/CommandSourceStack;Lnet/minecraft/resources/Identifier;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;Lnet/minecraft/world/level/block/Mirror;FIZ)I", cancellable = true)
    private static void placeTemplate__717943930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-717943930L))
            info.setReturnValue(1513592219);
    }

    @Inject(at = @At("HEAD"), method = "placeFeature(Lnet/minecraft/commands/CommandSourceStack;Lnet/minecraft/core/Holder$Reference;Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private static void placeFeature_1050215306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1050215306L))
            info.setReturnValue(419848480);
    }


}
