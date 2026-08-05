package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.HeightmapTypeArgument.class)
public class HeightmapTypeArgument1758233374Mixin {
        @Inject(at = @At("HEAD"), method = "heightmap()Lnet/minecraft/commands/arguments/HeightmapTypeArgument;", cancellable = true)
    private static void heightmap__2083599719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2083599719L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHeightmap(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/world/level/levelgen/Heightmap$Types;", cancellable = true)
    private static void getHeightmap__1685345954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1685345954L))
            info.setReturnValue(net.minecraft.world.level.levelgen.Heightmap.Types.OCEAN_FLOOR_WG);
    }


}
