package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.commands.SummonCommand.class)
public class SummonCommand_784261860Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lcom/mojang/brigadier/CommandDispatcher;Lnet/minecraft/commands/CommandBuildContext;)V", cancellable = true)
    private static void register__1303095718(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1303095718L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createEntity(Lnet/minecraft/commands/CommandSourceStack;Lnet/minecraft/core/Holder$Reference;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/nbt/CompoundTag;Z)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private static void createEntity__1519906522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1519906522L))
            info.setReturnValue(null);
    }


}
