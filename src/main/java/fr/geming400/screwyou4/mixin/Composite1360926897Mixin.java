package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.SlotDisplay.Composite.class)
public class Composite1360926897Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/crafting/display/SlotDisplay$Type;", cancellable = true)
    private void type_1566137904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1566137904L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_452300629(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(452300629L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2131350422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2131350422L))
            info.setReturnValue(")V3l4&\uC8F86`");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1918278988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1918278988L))
            info.setReturnValue(-1682849482);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/util/context/ContextMap;Lnet/minecraft/world/item/crafting/display/DisplayContentsFactory;)Ljava/util/stream/Stream;", cancellable = true)
    private void resolve__1135047115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1135047115L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEnabled(Lnet/minecraft/world/flag/FeatureFlagSet;)Z", cancellable = true)
    private void isEnabled_119027332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(119027332L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "contents()Ljava/util/List;", cancellable = true)
    private void contents_1233834235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1233834235L))
            info.setReturnValue(null);
    }


}
