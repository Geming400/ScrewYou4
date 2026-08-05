package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.SlotDisplay.OnlyWithComponent.class)
public class OnlyWithComponent371352245Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/crafting/display/SlotDisplay$Type;", cancellable = true)
    private void type_1086187770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1086187770L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1756864504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1756864504L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__764107730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-764107730L))
            info.setReturnValue("+da^f巼O8<)05'q?2$MB!fKd:cu:Kr40scZ{$䧭K(5be'B,'IjjSlZpoOTK/篼v5o%ࢳ1_qbpq❆#s%2.Z9Y");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_409614987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(409614987L))
            info.setReturnValue(-1548014602);
    }

    @Inject(at = @At("HEAD"), method = "component()Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private void component_1639671108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1639671108L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/util/context/ContextMap;Lnet/minecraft/world/item/crafting/display/DisplayContentsFactory;)Ljava/util/stream/Stream;", cancellable = true)
    private void resolve__1210763443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1210763443L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "source()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void source_1108305892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1108305892L))
            info.setReturnValue(null);
    }


}
