package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.SulfurCubeArchetype.AttributeEntry.class)
public class AttributeEntry_2056880413Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1148254144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1148254144L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1467663359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1467663359L))
            info.setReturnValue("JKMG;47\u56F5SV\u9BE06KkX5;u=");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1680734793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1680734793L))
            info.setReturnValue(-827429976);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/core/Holder;DLnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/entity/SulfurCubeArchetype$AttributeEntry;", cancellable = true)
    private static void add_270996158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(270996158L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "multiply(Lnet/minecraft/core/Holder;DLnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/entity/SulfurCubeArchetype$AttributeEntry;", cancellable = true)
    private static void multiply_1894946497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1894946497L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "modifier()Lnet/minecraft/world/entity/ai/attributes/AttributeModifier;", cancellable = true)
    private void modifier__201127686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-201127686L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attribute()Lnet/minecraft/core/Holder;", cancellable = true)
    private void attribute__2062189828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2062189828L))
            info.setReturnValue(null);
    }


}
