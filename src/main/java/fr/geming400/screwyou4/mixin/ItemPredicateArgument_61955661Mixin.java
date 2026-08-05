package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.item.ItemPredicateArgument.class)
public class ItemPredicateArgument_61955661Mixin {
        @Inject(at = @At("HEAD"), method = "getItemPredicate(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/commands/arguments/item/ItemPredicateArgument$Result;", cancellable = true)
    private static void getItemPredicate_491956734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(491956734L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemPredicate(Lnet/minecraft/commands/CommandBuildContext;)Lnet/minecraft/commands/arguments/item/ItemPredicateArgument;", cancellable = true)
    private static void itemPredicate_1938609805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1938609805L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1751692612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1751692612L))
            info.setReturnValue(null);
    }


}
