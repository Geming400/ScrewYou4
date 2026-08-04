package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.BuiltInLootTables.class)
public class BuiltInLootTables542453762Mixin {
        @Inject(at = @At("HEAD"), method = "all()Ljava/util/Set;", cancellable = true)
    private static void all__1286581476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1286581476L))
            info.setReturnValue(null);
    }


}
