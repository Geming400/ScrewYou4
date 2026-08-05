package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.commands.PlaceCommand.class)
public class PlaceCommand_686529936Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lcom/mojang/brigadier/CommandDispatcher;)V", cancellable = true)
    private static void register__257030288(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-257030288L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "placeFeature(Lnet/minecraft/commands/CommandSourceStack;Lnet/minecraft/core/Holder$Reference;Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private static void placeFeature__1584684709(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1584684709L))
            info.setReturnValue(-1614934529);
    }

    @Inject(at = @At("HEAD"), method = "placeStructure(Lnet/minecraft/commands/CommandSourceStack;Lnet/minecraft/core/Holder$Reference;Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private static void placeStructure__1584684709(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1584684709L))
            info.setReturnValue(-1614934529);
    }

    @Inject(at = @At("HEAD"), method = "placeJigsaw(Lnet/minecraft/commands/CommandSourceStack;Lnet/minecraft/core/Holder;Lnet/minecraft/resources/Identifier;ILnet/minecraft/core/BlockPos;)I", cancellable = true)
    private static void placeJigsaw__484008451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-484008451L))
            info.setReturnValue(-179597763);
    }

    @Inject(at = @At("HEAD"), method = "placeTemplate(Lnet/minecraft/commands/CommandSourceStack;Lnet/minecraft/resources/Identifier;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Rotation;Lnet/minecraft/world/level/block/Mirror;FIZ)I", cancellable = true)
    private static void placeTemplate__373961307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-373961307L))
            info.setReturnValue(754058737);
    }


}
