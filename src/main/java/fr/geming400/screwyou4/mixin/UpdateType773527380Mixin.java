package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.StructureBlockEntity.UpdateType.class)
public class UpdateType773527380Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/entity/StructureBlockEntity$UpdateType;", cancellable = true)
    private static void values_1486060565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1486060565L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/entity/StructureBlockEntity$UpdateType;", cancellable = true)
    private static void valueOf__945645412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-945645412L))
            info.setReturnValue(net.minecraft.world.level.block.entity.StructureBlockEntity.UpdateType.LOAD_AREA);
    }


}
