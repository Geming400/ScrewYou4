package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.item.ItemPredicateArgument.class)
public class ItemPredicateArgument_61955661Mixin {
        @Inject(at = @At("HEAD"), method = "itemPredicate(Lnet/minecraft/commands/CommandBuildContext;)Lnet/minecraft/commands/arguments/item/ItemPredicateArgument;", cancellable = true)
    private static void itemPredicate__921574103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-921574103L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples_1786569659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1786569659L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItemPredicate(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/commands/arguments/item/ItemPredicateArgument$Result;", cancellable = true)
    private static void getItemPredicate_1928776208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1928776208L))
            info.setReturnValue(null);
    }


}
