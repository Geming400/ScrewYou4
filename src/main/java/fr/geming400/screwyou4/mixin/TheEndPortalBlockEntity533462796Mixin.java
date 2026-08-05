package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.TheEndPortalBlockEntity.class)
public class TheEndPortalBlockEntity533462796Mixin {
        @Inject(at = @At("HEAD"), method = "shouldRenderFace(Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private void shouldRenderFace_38786537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(38786537L))
            info.setReturnValue(false);
    }


}
