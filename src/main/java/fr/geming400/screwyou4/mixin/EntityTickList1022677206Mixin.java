package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.entity.EntityTickList.class)
public class EntityTickList1022677206Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void remove_570952546(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(570952546L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void add_570952546(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(570952546L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "contains(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void contains_570956390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(570956390L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEach(Ljava/util/function/Consumer;)V", cancellable = true)
    private void forEach_1703693619(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1703693619L))
            info.cancel();
    }


}
