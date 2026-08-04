package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.SlabType.class)
public class SlabType_1788272576Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_652812104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(652812104L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/SlabType;", cancellable = true)
    private static void values_1815467086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1815467086L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/SlabType;", cancellable = true)
    private static void valueOf_1490191281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1490191281L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_652812104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(652812104L))
            info.setReturnValue(null);
    }


}
