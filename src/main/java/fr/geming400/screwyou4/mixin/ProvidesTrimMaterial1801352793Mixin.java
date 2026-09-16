package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.ProvidesTrimMaterial.class)
public class ProvidesTrimMaterial1801352793Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_892726525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(892726525L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1723190978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1723190978L))
            info.setReturnValue("e'7,x2_PE:cOaUoLS");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1936262412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1936262412L))
            info.setReturnValue(-2011978781);
    }

    @Inject(at = @At("HEAD"), method = "material()Lnet/minecraft/core/Holder;", cancellable = true)
    private void material_67773518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(67773518L))
            info.setReturnValue(null);
    }


}
