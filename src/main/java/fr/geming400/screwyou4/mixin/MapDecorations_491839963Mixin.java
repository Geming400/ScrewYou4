package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.MapDecorations.class)
public class MapDecorations_491839963Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1877352221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1877352221L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__643620013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-643620013L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_530102704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(530102704L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "decorations()Ljava/util/Map;", cancellable = true)
    private void decorations__1512783678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1512783678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withDecoration(Ljava/lang/String;Lnet/minecraft/world/item/component/MapDecorations$Entry;)Lnet/minecraft/world/item/component/MapDecorations;", cancellable = true)
    private void withDecoration_599435701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(599435701L))
            info.setReturnValue(null);
    }


}
