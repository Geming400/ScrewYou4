package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.StructureBlockEntity.UpdateType.class)
public class UpdateType773527380Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/entity/StructureBlockEntity$UpdateType;", cancellable = true)
    private static void values_1109205495(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1109205495L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/entity/StructureBlockEntity$UpdateType;", cancellable = true)
    private static void valueOf__1466315916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1466315916L))
            info.setReturnValue(net.minecraft.world.level.block.entity.StructureBlockEntity.UpdateType.LOAD_AREA);
    }


}
