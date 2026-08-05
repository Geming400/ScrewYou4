package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.entity.EntityTickList.class)
public class EntityTickList1022677206Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void remove_76623846(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(76623846L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void add__773026045(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-773026045L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "contains(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void contains_1785513349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1785513349L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "forEach(Ljava/util/function/Consumer;)V", cancellable = true)
    private void forEach_539167005(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(539167005L))
            info.cancel();
    }


}
