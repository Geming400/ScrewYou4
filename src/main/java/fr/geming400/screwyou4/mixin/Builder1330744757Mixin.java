package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.StateDefinition.Builder.class)
public class Builder1330744757Mixin {
        @Inject(at = @At("HEAD"), method = "add([Lnet/minecraft/world/level/block/state/properties/Property;)Lnet/minecraft/world/level/block/state/StateDefinition$Builder;", cancellable = true)
    private void add__2074719216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2074719216L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/util/function/Function;Lnet/minecraft/world/level/block/state/StateDefinition$Factory;)Lnet/minecraft/world/level/block/state/StateDefinition;", cancellable = true)
    private void create_677883382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(677883382L))
            info.setReturnValue(null);
    }


}
