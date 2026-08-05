package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ComponentArgument.class)
public class ComponentArgument1537487084Mixin {
        @Inject(at = @At("HEAD"), method = "textComponent(Lnet/minecraft/commands/CommandBuildContext;)Lnet/minecraft/commands/arguments/ComponentArgument;", cancellable = true)
    private static void textComponent_848310654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(848310654L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1032866213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1032866213L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRawComponent(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void getRawComponent_567069288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(567069288L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getResolvedComponent(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void getResolvedComponent_672850916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(672850916L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getResolvedComponent(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private static void getResolvedComponent__1585425999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1585425999L))
            info.setReturnValue(null);
    }


}
