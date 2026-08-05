package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ComponentArgument.class)
public class ComponentArgument1537487084Mixin {
        @Inject(at = @At("HEAD"), method = "textComponent(Lnet/minecraft/commands/CommandBuildContext;)Lnet/minecraft/commands/arguments/ComponentArgument;", cancellable = true)
    private static void textComponent_748429102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(748429102L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRawComponent(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void getRawComponent_492259891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(492259891L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getResolvedComponent(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void getResolvedComponent__759394046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-759394046L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getResolvedComponent(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void getResolvedComponent_492259891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(492259891L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__276161188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-276161188L))
            info.setReturnValue(null);
    }


}
