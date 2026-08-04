package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.MapItemColor.class)
public class MapItemColor_1569107534Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1340347504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1340347504L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_433647558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(433647558L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1607370275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1607370275L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rgb()I", cancellable = true)
    private void rgb_1607369779(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1607369779L))
            info.setReturnValue(null);
    }


}
