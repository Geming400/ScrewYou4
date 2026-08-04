package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.TamableAnimal.TamableAnimalPanicGoal.class)
public class TamableAnimalPanicGoal_1218974930Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1257249668(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1257249668L))
            info.cancel();
    }


}
